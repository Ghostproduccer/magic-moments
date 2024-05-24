<script setup>
import { ref, inject } from 'vue'

const cart = ref(inject('cart'))

const props = defineProps({
  item: {
    type: Object,
    required: true
  },
  index: {
    type: Number,
    required: true
  }
})

const handleRemoveFromCart = (target) => {
  let index = cart.value.indexOf(target)
  cart.value.splice(index, 1)
}
</script>

<template>
  <tr class="shopCartItem">
    <th scope="row">{{ props.index + 1 }}</th>
    <td>
      <img :src="props.item.imgUrl" alt="" class="img-fluid" />
    </td>
    <td>
      <RouterLink :to="`/products/${props.item.id}`">{{ props.item.name }}</RouterLink>
    </td>
    <td :style="{ color: item.color }">
      <i class="bi bi-record-fill"></i>
    </td>
    <td>{{ props.item.price.toFixed(2) }}</td>
    <td>{{ props.item.qty }}</td>
    <td>{{ props.item.discount * 100 }}%</td>
    <td>{{ (props.item.price * props.item.qty * (1 - props.item.discount)).toFixed(2) }}</td>
    <td>
      <a href="#" @click="handleRemoveFromCart(props.item)"><i class="bi bi-trash"></i></a>
    </td>
  </tr>
</template>

<style scoped>
.shopCartItem {
  margin-bottom: 20px;
}

.shopCartItem tr {
  margin-bottom: 20px !important;
}

.shopCartItem td,
.shopCartItem th {
  align-items: center  ;
  background: transparent;
  color: #ffffff;
  font-size: 1.2rem;
}

.shopCartItem a {
  color: #ffffff;
  font-size: 1.6rem;
}

.shopCartItem img {
  width: 120px;
  height: 70px;
  object-fit: cover;
  object-position: center;
  border-radius: 10px;
}

.shopCartItem i {
  font-size: 2rem;
}
</style>
