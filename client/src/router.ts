import Vue from 'vue';
import Router from 'vue-router';
import Lista_Esportes from './views/Lista_Esportes.vue';

Vue.use(Router);

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
      name: 'Lista_Esportes',
      component: Lista_Esportes,
    },
    {
      path: '/exercicios',
      name: 'exercicios',
      // route level code-splitting
      // this generates a separate chunk (about.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import(/* webpackChunkName: "about" */ './views/Lista_Exercicios.vue'),
    },
  ],
});
