<script setup>
const props = defineProps({
  item: {
    type: Object,
    required: true
  }
})
</script>

<template>
  <div class="banner-slide" :class="{ active: props.item.active }">
    <div class="content">
      <h1>{{ props.item.name }}</h1>
      <p>{{ props.item.brief.slice(0, 100) }}</p>
      <div class="options-container">
        <div class="colors">
          <h4>color</h4>
          <div class="color-list">
            <span
              v-for="color in props.item.colors"
              :key="color.id"
              :style="{ background: color.color }"
              :class="{ active: color.active }"
            ></span>
          </div>
        </div>
      </div>
      <div class="pricing">
        <RouterLink :to="`/products/${props.item.id}`" class="add-to-cart">Customize!</RouterLink>

        <span
          class="price"
          :style="[
            props.item.discount !== 0 && {
              textDecoration: 'line-through',
              textDecorationColor: 'red',
              fontSize: '1.2rem'
            }
          ]"
        >
          ${{ props.item.price.toLocaleString() }}
        </span>

        <span class="price" v-if="props.item.discount !== 0">
          ${{ (props.item.price * (1 - props.item.discount)).toFixed(0) }}
        </span>
      </div>
    </div>
    <div class="item-img">
      <div
        class="img-container"
        :class="{ active: props.item.active }"
        :style="{ background: props.item.bgColor }"
      >
        <img :src="props.item.imgUrl" alt="" />
      </div>
    </div>
  </div>
</template>

<style scoped>
.banner-slide {
  position: absolute;
  left: 0;
  top: 0;
  width: 100%;
  height: 90%;
  display: flex;
  transition: 1s;
  opacity: 0;
  visibility: hidden;
  transform: scale(0);
}

.banner-slide.active {
  opacity: 1;
  visibility: visible;
  transform: scale(1);
}

.content {
  width: 50%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  padding: 0 20px 60px 100px;
}

.content h1 {
  color: var(--textColor);
  font-size: 3.5rem;
}

.content p {
  color: var(--textColor);
  font-size: 1.05rem;
  margin-bottom: 30px;
}

.content .options-container {
  display: block;
  
}

.content .colors {
  display: block;
  gap: 50px;
  align-items: center;
  margin-bottom: 30px;
}

.content .colors h4 {
  color: var(--textColor);
  text-transform: uppercase;
  font-size: 1.35rem;
}

.content .colors .color-list {
  display: flex;
  gap: 20px;
}

.content .colors .color-list span {
  padding: 10px;
  content: '';
  border: 5px solid var(--textColor);
  border-radius: 50%;
  transition: 0.3s;
}

.content .colors .color-list span:hover,
.content .colors .color-list span.active {
  box-shadow: 0px 0 20px var(--primary);
}

.content .pricing {
  display: inline-flex;
  align-items: center;
  gap: 40px;
}

.content .pricing .add-to-cart {
  color: var(--bgColor);
  background: var(--textColor);
  padding: 20px 40px;
  text-transform: uppercase;
  font-size: 1.2rem;
  border-radius: 10px;
  font-weight: 600;
  letter-spacing: 1px;
  cursor: pointer !important;
}

.content .pricing .price {
  color: var(--primary);
  font-size: 2.5rem;
  font-weight: 600;
  letter-spacing: 1px;
}

.item-img {
  width: 50%;
  display: flex;
  align-items: center;
  justify-content: center;
}

.item-img .img-container {
  position: relative;
  width: 600px;
  height: 600px;
  border-radius: 50%;
  background: var(--primary);
  transform: rotateZ(180deg);
  transition: ease-in-out 1s;
}

.item-img .img-container.active {
  transform: rotateZ(0);
}

.item-img .img-container::before {
  position: absolute;
  content: '';
  left: 50%;
  top: 50%;
  transform: translate(-50%, -50%);
  width: 700px;
  height: 700px;
  border-radius: 50%;
  border: 5px solid #414141;
}

.item-img .img-container img {
  position: absolute;
  left: 50%;
  transform: translateX(-50%);
  width: 600px;
  height: 600px;
  object-fit: cover;
}

/* Responsive design
@media (max-width: 1440px) {
  .content {
    padding-bottom: 100px;
  }

  .content h1 {
    font-size: 3.5rem;
  }

  content p {
    font-size: 0.8rem;
    margin-bottom: 20px;
  }

  .content .colors {
    margin-bottom: 30px;
  }

  .item-img .img-container {
    width: 400px;
    height: 400px;
  }

  .item-img .img-container::before {
    width: 600px;
    height: 600px;
  }

  .item-img .img-container img {
    width: 420px;
    height: 420px;
  }

  .content .pricing .add-to-cart {
    padding: 10px 20px;
    font-size: 1rem;
  }

  .content .pricing .price {
    font-size: 2rem;
  }
}

@media (max-width: 768px) {
  .banner-slide {
    flex-direction: column-reverse;
  }

  .content {
    width: 100%;
    height: 50%;
    padding: 20px 20px 0 100px;
    justify-content: start;
  }

  .content h1 {
    font-size: 2rem;
  }

  .content p {
    font-size: 0.6rem;
    margin-bottom: 20px;
  }

  .content .pricing {
    gap: 15px;
  }

  .item-img {
    width: 100%;
    height: 50%;
    padding: 20px 20px 0 100px;
  }

  .item-img .img-container {
    width: 200px;
    height: 200px;
  }

  .item-img .img-container::before {
    width: 300px;
    height: 300px;
  }

  .item-img .img-container img {
    width: 200px;
    height: 300px;
  } */
</style>
