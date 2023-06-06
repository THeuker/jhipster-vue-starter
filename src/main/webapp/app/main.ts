import { createApp } from 'vue';
import { AppVue } from './common/primary/app';
import router from './router/router';
import { createPinia } from 'pinia';
import piniaPluginPersistedstate from 'pinia-plugin-persistedstate';
import './tailwind.css';

// jhipster-needle-main-ts-import

const app = createApp(AppVue);
app.use(router);
const pinia = createPinia();
pinia.use(piniaPluginPersistedstate);
app.use(pinia);

// jhipster-needle-main-ts-provider
app.mount('#app');
