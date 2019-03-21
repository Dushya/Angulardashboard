import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { RegisteredNotParticipatedComponent } from './registered-not-participated/registered-not-participated.component';
import { DashboardTableComponent } from './dashboard-table/dashboard-table.component'; 
import { Ng2SmartTableModule } from 'ng2-smart-table';
import { RegisteredNotParticipatedService } from './registered-not-participated.service';


@NgModule({
  declarations: [
    AppComponent,
     RegisteredNotParticipatedComponent,
     DashboardTableComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,
    Ng2SmartTableModule,
  ],
  providers: [RegisteredNotParticipatedService],
  bootstrap: [AppComponent]
})
export class AppModule { }
