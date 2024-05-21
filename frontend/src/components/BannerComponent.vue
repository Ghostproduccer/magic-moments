<script setup>
import { onMounted, ref } from 'vue'
import BannerSlideComponent from './BannerSlideComponent.vue'
import BannerSwiperComponent from './BannerSwiperComponent.vue'

const items = ref([])

// const urlapi = "http://localhost:8080/items"
const urlapi = "http://localhost:4000/items"

onMounted(() => {
  fetch(urlapi)
    .then((res) => res.json())
    .then((data) => (items.value = data))
    .catch((e) => console.log(e.message))
})

const handleBannerChange = (id) => {
  items.value.map((item) => {
    item.active = false
    if (item.id === id) item.active = true
    return item
  })
}
</script>
<template>
  <div class="banner">
    <BannerSlideComponent v-for="item in items" :key="item.id" :item="item" />

    <BannerSwiperComponent :items="items" :bannerChange="handleBannerChange" />
  </div>
</template>
<style scoped>
.banner {
  position: absolute;
  width: 100%;
  min-height: 90vh;
  background: var(--bgColor);
  transition: 1s;
}

@media (max-width: 768px) {
  .banner {
    min-height: 100vh;
  }
}
</style>
