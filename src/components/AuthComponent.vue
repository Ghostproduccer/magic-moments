<script setup>

</script>

<template>
  <div class="auth-section">
    <RouterLink to="/login" class="auth">Log in / Sign Up</RouterLink>
  </div>
</template>

<style scoped>
.auth-section {
  display: flex;
  align-items: center;
  gap: 10px;
  transition: 0.5s;
  color: var(--textColor);
}

.auth {
  font-size: 18px;
  color: var(--textColor);
}

.auth:hover {
  color: var(--primary);
}
</style>
