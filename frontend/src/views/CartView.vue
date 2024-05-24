<script setup>
import { inject, ref } from 'vue';
const cart = ref(inject("cart"))
</script>
<template>
    <div class="shoppingCart" v-if="cart.length > 0">
        <div class="container">
            <div class="row">
                <div class="table-responsive">
                    <table class="shopCartTable table table-borderless align-middle">
                        <thead>
                            <tr>
                                <th scope="col"></th>
                                <th scope="col"></th>
                                <th scope="col"></th>
                                <th scope="col"></th>
                                <th scope="col"></th>
                                <th scope="col"></th>
                                <th scope="col"></th>
                                <th scope="col"></th>
                                <th scope="col"></th>
                            </tr>
                        </thead>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <div class="shoppingCart" v-else>
        <div class="container">
            <div class="row mt-5">
                <h1>Your Cart is Empty</h1>
            </div>
        </div>
    </div>

</template>
<style scoped>
    
</style>