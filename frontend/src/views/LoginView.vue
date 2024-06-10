<script setup>

</script>
<template>
    
    <div class="container d-flex justify-content-center">
      <div class="card">
        <div class="card-body p-5">
          <form class="mb-3 mt-md-4 was-validated">
            <img src="#" alt="" class="img-fluid">
            Por favor, introduce tu usuario y contraseña
            <div class="mb-3">
              <label for="user" class="form-label text-light">Usuario</label>
              <input type="text" class="form-control" id="email" placeholder="usuario" name="user" required>
            </div>
            <div class="mb-3">
              <label for="password" class="form-label text-light">Contraseña</label>
              <input type="password" class="form-control" id="password" placeholder="*******" name="password" required>
            </div>
            <div id="error-message"></div>
            <p class="small"><a class="text-secondary" href="forget-password.html">¿Has olvidado la contraseña?</a>
            </p>
            <div class="d-grid">
              <button class="btn btn-outline-secondary" type="submit">Iniciar sesión</button>
            </div>
          </form>
          <div>
            <p class="mb-0  text-center text">¿No tienes cuenta? <router-link to="/register" class="text-light fw-bold">
                Regístrate.</router-link></p>
          </div>

        </div>
      </div>
    </div>
</template>

<style scoped>
    body {
  max-height: 100vh;
}

.container {
  max-height: 100vh;
}

.card-img-top {
  padding: 2em;
}

.card-body {
  padding: 2em;
  color: var(--textColor);
}

.card {
  max-width: 500px; 
  max-height: 650px;
  margin-top: 20%;
  margin-bottom: 10%;
  background: var(--bgColor);
}
</style>