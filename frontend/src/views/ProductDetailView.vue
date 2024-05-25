<script setup>
import { onMounted, ref, inject } from 'vue'
import { useRoute } from 'vue-router'

const route = useRoute()
const id = route.params.id

const qty = ref(1)
const handleQtyChange = (add = true) => {
  if (add) {
    qty.value += 1
  } else {
    if (qty.value < 2) return
    qty.value -= 1
  }
}

const item = ref({})

onMounted(() => {
  fetch(`http://localhost:4000/items/${id}`)
    .then((res) => res.json())
    .then((data) => (item.value = data))
    .catch((e) => console.log(e))
})

const selectedColor = ref('#fdb82c')
const handleColorChange = (color, id) => {
  selectedColor.value = color
  item.value.colors.map((color) => {
    color.active = false
    if (color.id === id) color.active = true
    return color
  })
}

const cart = ref(inject("cart"))

const handleAddToCart = item => {
  const itemToAdd = { ...item, color: selectedColor.value, qty: qty.value }
  
  const existingItem = cart.value.find(prod => prod.id === item.id)
  
  if (existingItem) {
    existingItem.qty += itemToAdd.qty
  } else {
    cart.value.push(itemToAdd)
  }
  
  console.log(cart.value)
}
</script>
<template>
  <div>
    <div class="product-details py-5">
      <div class="container">
        <div class="row">
          <div class="col-lg-2">
            <div class="row">
              <div class="col">
                <div class="itemPreview">
                  <img src="" alt="" class="img-fluid" />
                </div>
                <div class="itemPreview">
                  <img src="" alt="" class="img-fluid" />
                </div>
                <div class="itemPreview">
                  <img src="" alt="" class="img-fluid" />
                </div>
              </div>
            </div>
          </div>
          <div class="col-lg-5">
            <img :src="item.imgUrl" alt="" class="img-fluid itemImg" />
          </div>
          <div class="col-lg-5">
            <h2>{{ item.name }}</h2>
            <div class="item-price">
              <h4 class="price" v-if="item.price">Price: {{ item.price.toLocaleString() }}</h4>
              <h4 class="discount" v-if="item.discount !== 0">
                <i>{{ item.discount * 100 }}% Off</i>
              </h4>
              <h4 class="currentPrice" v-if="item.discount !== 0">
                <span class="now">NOW</span> :
                {{ ((1 - item.discount) * item.price).toFixed(2) }}
              </h4>
            </div>
            <h4>Product Details</h4>
            <p>{{ item.brief }}</p>
            <h4>Color</h4>
            <div class="color" v-if="item.colors">
              <span
                v-for="color in item.colors"
                :key="color.id"
                :style="{ background: color.color }"
                :class="{ active: color.active }"
                @click="handleColorChange(color.color, color.id)"
              >
              </span>
            </div>
            <h4>Quantity</h4>
            <div class="quantity">
              <a href="#" class="qtyButton" @click.stop.prevent="handleQtyChange(false)"
                ><i class="bi bi-dash"></i
              ></a>
              <span class="qty">{{ qty }}</span>
              <a href="#" class="qtyButton" @click.stop.prevent="handleQtyChange()"
                ><i class="bi bi-plus"></i
              ></a>
            </div>
            <a href="#" class="addButton me-3" @click.stop.prevent="handleAddToCart(item)">Add to Cart</a>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>
.product-details {
  transition: 0.5s;
}

.product-details h1,
.product-details h2,
.product-details h4,
.product-details p {
  color: var(--textColor);
  font-family: 'Roboto', sans-serif;
}

.product-details h2 {
  margin-bottom: 20px;
}

.itemPreview {
  background: var(--bgColor);
  box-shadow: 0px 0 15px rgba(255, 255, 255, 0.2);
  margin-bottom: 20px;
}

.item-price {
  display: flex;
  align-items: center;
  gap: 10px; /* Adjust the gap as needed */
  margin-bottom: 20px;
}

.price,
.discount,
.currentPrice {
  margin: 0; /* Reset margin if needed */
}

.discount {
  color: var(--primary);
}

.currentPrice {
  font-size: 1.5rem;
}

.currentPrice .now {
  font-size: 1.5rem;
  color: var(--primary);
  font-style: italic;
}

.price {
  color: var(--primary);
}

.color {
  display: inline-flex;
  gap: 20px;
  margin-bottom: 20px;
}

.color span {
  padding: 10px;
  content: '';
  border: 5px solid var(--textColor);
  border-radius: 50%;
  transition: 0.3s;
}

.color span:hover,
.color span.active {
  box-shadow: 0px 0 20px rgba(253, 184, 44, 0.8);
}

.quantity {
  display: flex;
  gap: 20px;
  align-items: center;
  justify-content: center;
  padding: 10px;
  width: 120px;
  background: 0px 0 15px rgba(255, 255, 255, 0.2);
  margin-bottom: 20px;
}

.qty {
  font-size: 1.3rem;
  color: var(--primary);
}

.qtyButton {
  color: var(--primary);
}

.qtyButton i {
  font-size: 1.2rem;
}

.addButton {
  position: relative;
  margin-top: 20px;
  color: var(--textColor);
  text-decoration: none;
  padding: 10px 25px;
  width: 300px;
  background: var(--primary);
  font-size: 1.2rem;
  text-transform: uppercase;
  letter-spacing: 1px;
  font-weight: 300;
  transition: 0.5s;
}

.addButton:hover {
  background: #fe9400;
}
</style>
