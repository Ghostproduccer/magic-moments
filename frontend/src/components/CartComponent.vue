<script setup></script>

<template>
  <div class="cart-btn">
    <RouterLink to="/cart" class="cart"><i class="bi bi-cart"></i></RouterLink>
    <span class="count">3</span>
  </div>
</template>

<style scoped>
.cart-btn {
  display: flex;
  font-size: 25px;
  align-items: center;
  gap: 10px;
  transition: 0.5s;
  color: #ffffff;
}

.cart {
  font-size: 25px;
  color: #ffffff;
}

.count {
  font-size: 1rem;
  color: #ffffff;
  width: 25px;
  height: 25px;
  padding: 5px;
  border-radius: 50%;
  background: #00a950;
  display: inline-flex;
  justify-content: center;
  align-items: center;
}
</style>
