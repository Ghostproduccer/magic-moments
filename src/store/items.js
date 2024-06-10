import { defineStore } from "pinia";

export const useItemsStore = defineStore('items', {
    state: () => {
        return {
            items : []
        }
    },
    getters: {
        getAll: (state) => state.items
    },
    actions: {
        fetchItems() {
            const urlapi = "http://localhost:4000/items"
            fetch(urlapi)
              .then((res) => res.json())
              .then((data) => (this.items = data))
              .catch((e) => console.log(e.message))
          }
    }
})