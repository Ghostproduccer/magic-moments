<script setup>
import { ref, inject } from 'vue'

const cart = ref(inject('cart'))

const handleTotalItems = (items) => {
  let total = 0;
  items.forEach(item => {
    total += item.qty;
  });
  return total;
};

</script>

<template>
  <RouterLink to="/cart" class="cart-btn">
    <i class="bi bi-cart cart"></i>
    <span class="count">{{ handleTotalItems(cart) }}</span>
  </RouterLink>
</template>

<style scoped>
.cart-btn {
  display: flex;
  font-size: 25px;
  align-items: center;
  gap: 10px;
  transition: 0.5s;
  color: var(--textColor);
}

.cart-btn:hover .cart {
  /* Estilos para el ícono de carrito cuando se hace hover sobre el enlace */
  color: var(--textColor);
}

.cart-btn:hover .count {
  
  background: var(--textColor);
}


.cart {
  font-size: 25px;
  color: var(--primary);
}
.count {
  font-size: 1rem;
  color: var(--bgColor);
  width: 25px;
  height: 25px;
  padding: 5px;
  border-radius: 50%;
  background: var(--primary);
  display: inline-flex;
  justify-content: center;
  align-items: center;
}
</style>
