<script setup>

</script>
<template>
     <div class="container">
        <main>
            <br>
            <div class="row g-5">
                <div class="col-md-5 col-lg-4 order-md-last">
                    <h4 class="d-flex justify-content-between align-items-center mb-3">
                        <span class="text-light">Tu carrito</span>
                        <span class="badge bg-secondary rounded-pill">3</span>
                    </h4>
                    <ul class="list-group mb-3">
                        <li class="list-group-item d-flex justify-content-between lh-sm">
                            <div>
                                <h6 class="my-0">Nombre del producto</h6>
                                <small class="text-muted">descripción</small>
                            </div>
                            <span class="text-muted">12€</span>
                        </li>
                        <li class="list-group-item d-flex justify-content-between lh-sm">
                            <div>
                                <h6 class="my-0">Nombre del producto</h6>
                                <small class="text-muted">descripción</small>
                            </div>
                            <span class="text-muted">8€</span>
                        </li>
                        <li class="list-group-item d-flex justify-content-between lh-sm">
                            <div>
                                <h6 class="my-0">Nombre del producto</h6>
                                <small class="text-muted">descripción</small>
                            </div>
                            <span class="text-muted">5€</span>
                        </li>
                        <li class="list-group-item d-flex justify-content-between bg-light">
                            <div class="text-success">
                                <h6 class="text-dark">Código de descuento</h6>
                                <small>EXAMPLECODE</small>
                            </div>
                            <span class="text-success">-5€</span>
                        </li>
                        <li class="list-group-item d-flex justify-content-between">
                            <span>Total (EUR)</span>
                            <strong>20€</strong>
                        </li>
                    </ul>

                    <form class="card p-2">
                        <div class="input-group">
                            <input type="text" class="form-control" placeholder="Promo code">
                            <button type="submit" class="btn btn-secondary">Canjear</button>
                        </div>
                    </form>
                </div>
                <div class="col-md-7 col-lg-8">


                    <h4 class="mb-3">Pago</h4>

                    <div class="my-3">

                    </div>
                    <div class="accordion accordion-flush" id="accordionFlushExample">
                        <div class="accordion-item">
                            <h2 class="accordion-header" id="flush-headingOne">
                                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse"
                                    data-bs-target="#flush-collapseOne" aria-expanded="false"
                                    aria-controls="flush-collapseOne">
                                    <img src="#" width="25" alt=""> &nbsp; &nbsp;Tarjeta
                                    de crédito/débito
                                </button>
                            </h2>
                            <div id="flush-collapseOne" class="accordion-collapse collapse"
                                aria-labelledby="flush-headingOne" data-bs-parent="#accordionFlushExample">
                                <br>
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img
                                    src="https://images.squarespace-cdn.com/content/v1/5a760a4890bade7aa2cc94b2/1530909622840-T9MKK1Y7MHGJRECSTWXQ/credit-card-logos+copy.png?format=300w"
                                    class="img-fluid" alt="Responsive image" width="90">
                                <div class="accordion-body">
                                    <form action="/pagoexitoso.html">
                                        <div class="row gy-3">
                                            <div class="col-md-6">
                                                <label for="cc-name" class="form-label">Nombre en la tarjeta</label>
                                                <input type="text" class="form-control" id="cc-name" placeholder=""
                                                    required>
                                                <small class="text-muted">Nombre completo que aparece en la
                                                    tarjeta</small>
                                                <div class="invalid-feedback">
                                                    El nombre es obligatorio.

                                                </div>
                                            </div>

                                            <div class="col-md-6">
                                                <label for="cc-number" class="form-label">Número</label>
                                                <input type="text" class="form-control" id="cc-number" placeholder=""
                                                    required>
                                                <div class="invalid-feedback">
                                                    Por favor, introduce el número de tu tarjeta de crédito/débito.
                                                </div>
                                            </div>

                                            <div class="col-md-3">
                                                <label for="cc-expiration" class="form-label">Expiration</label>
                                                <input type="text" class="form-control" id="cc-expiration"
                                                    placeholder="" required>
                                                <div class="invalid-feedback">
                                                    Por favor, introduce la fecha de expiración de la tarjeta.
                                                </div>
                                            </div>

                                            <div class="col-md-3">
                                                <label for="cc-cvv" class="form-label">CVV</label>
                                                <input type="text" class="form-control" id="cc-cvv" placeholder=""
                                                    required>
                                                <div class="invalid-feedback">
                                                    Código de seguridad obligatorio.
                                                </div>
                                            </div>
                                            <button class="w-100 btn btn-secondary btn-lg" type="submit">Confirmar
                                                pago</button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <div class="accordion-item" data-bs-theme="dark">
                            <h2 class="accordion-header" id="flush-headingTwo">
                                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse"
                                    data-bs-target="#flush-collapseTwo" aria-expanded="false"
                                    aria-controls="flush-collapseTwo">
                                    <img src="#" alt="" width="25"> &nbsp; &nbsp;Paypal
                                </button>
                            </h2>
                            <div id="flush-collapseTwo" class="accordion-collapse collapse"
                                aria-labelledby="flush-headingTwo" data-bs-parent="#accordionFlushExample">
                                <br>
                                <br>
                                <FORM action="https://www.paypal.com/es/webapps/mpp/home">
                                    <button type="submit" class="btn btn-secondary">
                                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
                                            fill="currentColor" class="bi bi-paypal" viewBox="0 0 16 16">
                                            <path
                                                d="M14.06 3.713c.12-1.071-.093-1.832-.702-2.526C12.628.356 11.312 0 9.626 0H4.734a.7.7 0 0 0-.691.59L2.005 13.509a.42.42 0 0 0 .415.486h2.756l-.202 1.28a.628.628 0 0 0 .62.726H8.14c.429 0 .793-.31.862-.731l.025-.13.48-3.043.03-.164.001-.007a.351.351 0 0 1 .348-.297h.38c1.266 0 2.425-.256 3.345-.91.379-.27.712-.603.993-1.005a4.942 4.942 0 0 0 .88-2.195c.242-1.246.13-2.356-.57-3.154a2.687 2.687 0 0 0-.76-.59l-.094-.061ZM6.543 8.82a.695.695 0 0 1 .321-.079H8.3c2.82 0 5.027-1.144 5.672-4.456l.003-.016c.217.124.4.27.548.438.546.623.679 1.535.45 2.71-.272 1.397-.866 2.307-1.663 2.874-.802.57-1.842.815-3.043.815h-.38a.873.873 0 0 0-.863.734l-.03.164-.48 3.043-.024.13-.001.004a.352.352 0 0 1-.348.296H5.595a.106.106 0 0 1-.105-.123l.208-1.32.845-5.214Z">
                                            </path>
                                        </svg>
                                        Pagar con Paypal
                                    </button>
                                </FORM>
                                <br>
                                <br>
                            </div>
                            <div class="accordion-item">
                                <h2 class="accordion-header" id="flush-headingThree">
                                    <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse"
                                        data-bs-target="#flush-collapseThree" aria-expanded="false"
                                        aria-controls="flush-collapseThree">
                                        <img src="#" alt="" width="25"> &nbsp; &nbsp;Bitcoin
                                    </button>
                                </h2>
                                <div id="flush-collapseThree" class="accordion-collapse collapse"
                                    aria-labelledby="flush-headingThree" data-bs-parent="#accordionFlushExample">
                                    <div class="accordion-body">

                                        <div class="card" style="width: 18rem;">
                                            <img src="https://chart.googleapis.com/chart?chs=300x300&cht=qr&chl=bitcoin%3A1DonateWffyhwAjskoEwXt83pHZxhLTr8H%3Famount%3D0.15050000"
                                                class="card-img-top" alt="...">
                                            <div class="card-body">
                                                <p class="card-text"><strong>1DonateWffyhwAjskoEwXt83pHZxhLTr8H</strong>
                                                </p>
                                                <form action="/pagoexitoso.html">
                                                    <button class="w-100 btn btn-secondary btn-lg"
                                                        type="submit">Confirmar pago</button>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
        <footer class="my-5 pt-5 text-muted text-center text-small">
            <p class="mb-1">&copy; Bruno Rodríguez</p>

        </footer>
    </div>
</template>

<style scoped>
    
</style>