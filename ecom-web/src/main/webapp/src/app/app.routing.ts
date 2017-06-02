import {Routes, RouterModule} from "@angular/router";
import {AboutComponent} from "./about/components/about.component";
import {HomeComponent} from "./Home/home.component";
import {ModuleWithProviders} from "@angular/core";

const appRoutes: Routes = [
    {path: '', component: HomeComponent},
    {path: 'about', component: AboutComponent}
];

export const appRoutingProviders: any[] = [];
export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes, { useHash: true });
