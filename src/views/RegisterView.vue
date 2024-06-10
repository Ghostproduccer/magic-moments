<script setup>
const handleSubmit = () => {}

const checkPassword = () => {}
</script>
<template>
  <div class="container">
    <main>
      <div class="container">
        <div class="container-fluid">
          <h4 class="mb-3">Register</h4>
          <form method="post">
            <div class="row g-3">
              <div class="col-sm-4">
                <label for="firstName" class="form-label">Name</label>
                <input
                  type="text"
                  class="form-control"
                  id="firstName"
                  placeholder="Name"
                  name="name"
                  required
                />
              </div>

              <div class="col-sm-4">
                <label for="surname" class="form-label">Surname</label>
                <input
                  type="text"
                  class="form-control"
                  id="surname"
                  placeholder="Apellidos"
                  name="surname"
                  required
                />
              </div>
            </div>
            <br />
            <div class="row g-3">
              <div class="col-4">
                <label for="username" class="form-label">Username</label>
                <div class="input-group has-validation">
                  <span class="input-group-text">@</span>
                  <input
                    type="text"
                    class="form-control"
                    id="username"
                    placeholder="Username"
                    name="username"
                    required
                  />
                </div>
              </div>
            </div>
            <br />
            <div class="row g-3">
              <div class="col-4">
                <label for="password" class="form-label">Contraseña</label>
                <div class="input-group has-validation">
                  <span class="input-group-text"><i class="bi bi-key"></i></span>
                  <input
                    type="password"
                    class="form-control"
                    id="password"
                    placeholder="***********"
                    name="password"
                    required
                  />
                </div>
              </div>
              <div class="col-4">
                <label for="confirmPassword" class="form-label">Confirm Password</label>
                <div class="input-group has-validation">
                  <span class="input-group-text">
                    <i class="bi bi-key"></i>
                  </span>
                  <input
                    type="password"
                    class="form-control"
                    id="confirmPassword"
                    placeholder="***********"
                    name="confirmPassword"
                    required
                  />
                </div>
              </div>
            </div>
            <br />
            <div class="row g-3">
              <div class="col-6">
                <label for="email" class="form-label">Email</label>
                <input
                  type="email"
                  class="form-control"
                  id="email"
                  placeholder="you@example.com"
                  name="email"
                  required
                />
              </div>

              <hr class="my-4" />
              <br />
              <button class="w-100 btn btn-secondary btn-lg" @click="handleSubmit">
                Continuar
              </button>
            </div>
          </form>
        </div>
      </div>
    </main>
    <footer class="my-5 pt-5 text-muted text-center text-small">
      <p class="mb-1">&copy; Bruno Rodríguez</p>
    </footer>
  </div>
</template>
<style scoped>
.container {
  color: var(--textColor);
}
.btn:hover {
  background-color: var(--primary);
}
h4 {
    color: var(--primary);
}
</style>
