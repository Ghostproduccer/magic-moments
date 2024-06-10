<script setup>
</script>
<template>
  <div class="container mt-2">
    <main>
      <div class="container">
        <div class="container-fluid">
          <h4 class="mb-3">Sign Up</h4>
          <br>
          <form method="post" @submit.prevent="handlesubmit">
            <div class="row g-3">
              <div class="col-sm-4">
                <input
                  type="text"
                  class="form-control"
                  id="firstName"
                  placeholder="First name"
                  name="name"
                  required
                />
              </div>

              <div class="col-sm-4">
                <input
                  type="text"
                  class="form-control"
                  id="surname"
                  placeholder="Surname"
                  name="surname"
                  required
                />
              </div>
            </div>
            <br />
            <div class="row g-3">
              <div class="col-4">
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
                <label for="password" class="form-label">Password</label>
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
              <button class="w-100 btn btn-secondary btn-lg" type="submit">
                Continue
              </button>
            </div>
          </form>
        </div>
      </div>
    </main>
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
