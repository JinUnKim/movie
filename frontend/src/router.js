
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ReserveReservationManager from "./components/listers/ReserveReservationCards"
import ReserveReservationDetail from "./components/listers/ReserveReservationDetail"

import PointPointManager from "./components/listers/PointPointCards"
import PointPointDetail from "./components/listers/PointPointDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/reserves/reservations',
                name: 'ReserveReservationManager',
                component: ReserveReservationManager
            },
            {
                path: '/reserves/reservations/:id',
                name: 'ReserveReservationDetail',
                component: ReserveReservationDetail
            },

            {
                path: '/points/points',
                name: 'PointPointManager',
                component: PointPointManager
            },
            {
                path: '/points/points/:id',
                name: 'PointPointDetail',
                component: PointPointDetail
            },



    ]
})
