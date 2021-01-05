import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { ConfigureEntitiesListComponent } from './components/configure-entities-list/configure-entities-list.component';
import { ConfigureEntitiesFormComponent } from './components/configure-entities-form/configure-entities-form.component';
import { CommissionReportListComponent } from './components/commission-report-list/commission-report-list.component';
import { CommissionReportFormComponent } from './components/commission-report-form/commission-report-form.component';
import { ConfigureEntitiesService } from './services/configure-entities-service/configure-entities.service';
import { CommissionReportService } from './services/commission-report-service/commission-report.service';

@NgModule({
  declarations: [
    AppComponent,
    ConfigureEntitiesListComponent,
    ConfigureEntitiesFormComponent,
    CommissionReportListComponent,
    CommissionReportFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [ConfigureEntitiesService, CommissionReportService],
  bootstrap: [AppComponent]
})
export class AppModule { }