<script setup>
import { onMounted, ref } from 'vue'
import { useRoute } from 'vue-router'

const route = useRoute()
const id = route.params.id

const item = ref({})

onMounted(() => {
  fetch(`http://localhost:4000/items/${id}`)
    .then((res) => res.json())
    .then((data) => (item.value = data))
    .catch((e) => console.log(e))
})
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
                  <img src="/imagesItem-detail-img-1.png" alt="" class="img-fluid" />
                </div>
                <div class="itemPreview">
                  <img src="/imagesItem-detail-img-1.png" alt="" class="img-fluid" />
                </div>
                <div class="itemPreview">
                  <img src="/imagesItem-detail-img-1.png" alt="" class="img-fluid" />
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
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<style scoped></style>
