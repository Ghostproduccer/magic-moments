<script setup>
import { navsData } from '@/data/data'
import { ref } from 'vue'
import CartComponent from './CartComponent.vue'
import AuthComponent from './AuthComponent.vue'

const navs = ref(navsData)

const handleNavActive = (id) => {
  navs.value.map((nav) => {
    nav.active = false
    if (nav.id === id) nav.active = true
    return nav
  })
}
</script>

<template>
  <header id="home">
    <RouterLink to="/" class="logo" @click = "handleNavActive(1)">Magic Moments</RouterLink>
    
    <div class="features">
      <AuthComponent/>
      <CartComponent />
    </div>
  </header>
</template>

<style scoped>
header {
  position: relative;
  width: 100%;
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 30px 100px 30px 100px;
  z-index: 1100;
}

.logo {
  font-size: 30px;
  color: var(--textColor);
  letter-spacing: 2px;
  font-weight: 800;
}

.logo:hover {
  color: var(--primary)
}

.nav {
  display: flex;
}

.nav li {
  list-style: none;
  margin: 0 10px;
}

nav li a {
  color: var(--textColor);
  text-decoration: none;
  font-weight: 600;
  letter-spacing: 2px;
  cursor: pointer;
  transition: 0.3s;
}

.nav li:hover a,
.nav li a.active {
  color: var(--primary);
}

.features {
  display: flex;

  gap: 60px;
}

@media (max-width: 768px) {
  header {
    padding: 10px 50px;
  }

  .nav {
    display: none;
  }
}
</style>
