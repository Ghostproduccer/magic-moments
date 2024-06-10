<script setup>

</script>
<template>
    <div class="container">
        <main>
            <br>
            <div class="container">

                <div class="container-fluid">
                    <h4 class="mb-3">Enter your data</h4>
                    <form>
                        <div class="row g-3">
                            <div class="col-sm-4">
                                <label for="firstName" class="form-label">Nombre</label>
                                <input type="text" class="form-control" id="firstName" placeholder="Nombre" name="name"
                                    required>
                                <div class="invalid-feedback">
                                    Por favor introduzca su nombre.
                                </div>
                            </div>

                            <div class="col-sm-4">
                                <label for="lastName" class="form-label">Apellidos</label>
                                <input type="text" class="form-control" id="lastName" placeholder="Apellidos" name="surname"
                                    required>
                                <div class="invalid-feedback">
                                    Por favor, introduzca sus apellidos.
                                </div>
                            </div>
                        </div>
                        <br>
                        <div class="row g-3">
                            <div class="col-4">
                                <label for="username" class="form-label">Nombre de Usuario</label>
                                <div class="input-group has-validation">
                                    <span class="input-group-text">@</span>
                                    <input type="text" class="form-control" id="username" placeholder="Username"
                                        name="username" required>
                                    <div class="invalid-feedback">
                                        El nombre de usuario es obligatorio.
                                    </div>
                                </div>
                            </div>
                        </div>
                        <br>
                        <div class="row g-3">
                            <div class="col-4">
                                <label for="password" class="form-label">Contraseña</label>
                                <div class="input-group has-validation">
                                    <span class="input-group-text"><svg xmlns="http://www.w3.org/2000/svg" width="16"
                                            height="16" fill="currentColor" class="bi bi-key" viewBox="0 0 16 16">
                                            <path
                                                d="M0 8a4 4 0 0 1 7.465-2H14a.5.5 0 0 1 .354.146l1.5 1.5a.5.5 0 0 1 0 .708l-1.5 1.5a.5.5 0 0 1-.708 0L13 9.207l-.646.647a.5.5 0 0 1-.708 0L11 9.207l-.646.647a.5.5 0 0 1-.708 0L9 9.207l-.646.647A.5.5 0 0 1 8 10h-.535A4 4 0 0 1 0 8zm4-3a3 3 0 1 0 2.712 4.285A.5.5 0 0 1 7.163 9h.63l.853-.854a.5.5 0 0 1 .708 0l.646.647.646-.647a.5.5 0 0 1 .708 0l.646.647.646-.647a.5.5 0 0 1 .708 0l.646.647.793-.793-1-1h-6.63a.5.5 0 0 1-.451-.285A3 3 0 0 0 4 5z" />
                                            <path d="M4 8a1 1 0 1 1-2 0 1 1 0 0 1 2 0z" />
                                        </svg></span>
                                    <input type="password" class="form-control" id="password" placeholder="***********"
                                        name="password" required>
                                    <div class="invalid-feedback">
                                        la contraseña ees obligatoria
                                    </div>
                                </div>
                            </div>
                            <div class="col-4">
                                <label for="password" class="form-label">Repetir Contraseña</label>
                                <div class="input-group has-validation">
                                    <span class="input-group-text"><svg xmlns="http://www.w3.org/2000/svg" width="16"
                                            height="16" fill="currentColor" class="bi bi-key" viewBox="0 0 16 16">
                                            <path
                                                d="M0 8a4 4 0 0 1 7.465-2H14a.5.5 0 0 1 .354.146l1.5 1.5a.5.5 0 0 1 0 .708l-1.5 1.5a.5.5 0 0 1-.708 0L13 9.207l-.646.647a.5.5 0 0 1-.708 0L11 9.207l-.646.647a.5.5 0 0 1-.708 0L9 9.207l-.646.647A.5.5 0 0 1 8 10h-.535A4 4 0 0 1 0 8zm4-3a3 3 0 1 0 2.712 4.285A.5.5 0 0 1 7.163 9h.63l.853-.854a.5.5 0 0 1 .708 0l.646.647.646-.647a.5.5 0 0 1 .708 0l.646.647.646-.647a.5.5 0 0 1 .708 0l.646.647.793-.793-1-1h-6.63a.5.5 0 0 1-.451-.285A3 3 0 0 0 4 5z" />
                                            <path d="M4 8a1 1 0 1 1-2 0 1 1 0 0 1 2 0z" />
                                        </svg></span>
                                    <input type="password" class="form-control" id="password" placeholder="***********"
                                        name="password" required>
                                    <div class="invalid-feedback">
                                        la contraseña ees obligatoria
                                    </div>
                                </div>
                            </div>
                        </div>
                        <br>
                        <div class="row g-3">
                            <div class="col-6">
                                <label for="email" class="form-label">Email</label>
                                <input type="email" class="form-control" id="email" placeholder="you@example.com"
                                    name="email">
                                <div class="invalid-feedback">
                                    Por favor Introduzca una cuenta de correo válida.
                                </div>
                            </div>

                            <hr class="my-4">
                            <br>
                            <button class="w-100 btn btn-secondary btn-lg" type="submit">Continuar</button>
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
        color: var(--textColor)
    }
    .btn:hover {
        background-color: var(--primary);
    }
</style>