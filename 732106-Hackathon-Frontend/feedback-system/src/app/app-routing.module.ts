import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegisteredNotParticipatedComponent } from './registered-not-participated/registered-not-participated.component';
import { DashboardTableComponent } from './dashboard-table/dashboard-table.component';


const routes: Routes = [
    { path: '', redirectTo: 'registeredNotParticipated', pathMatch: 'full' },
     { path: 'registeredNotParticipated', component: RegisteredNotParticipatedComponent },
     { path: 'dashboard', component: DashboardTableComponent },
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})

export class AppRoutingModule { }
