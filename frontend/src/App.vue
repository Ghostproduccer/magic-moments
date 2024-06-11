<script setup>
import { onMounted } from 'vue';
import HeaderComponent from './components/HeaderComponent.vue'
import { useItemsStore } from '@/store/items'

const itemsStore = useItemsStore()
onMounted(() => {
  itemsStore.fetchItems()
})
</script>

<template>
  <HeaderComponent />
  <main id="main">
    <RouterView />
  </main>
</template>

<style scoped></style>
