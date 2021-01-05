import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ConfigureEntitiesListComponent } from './components/configure-entities-list/configure-entities-list.component';
import { ConfigureEntitiesFormComponent } from './components/configure-entities-form/configure-entities-form.component';
import { CommissionReportListComponent } from './components/commission-report-list/commission-report-list.component';
import { CommissionReportFormComponent } from './components/commission-report-form/commission-report-form.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: '/configureEntities',
    pathMatch: 'full'
  },
  {
    path: 'configureEntities',
    component: ConfigureEntitiesListComponent
  },
  {
    path: 'configureEntities/:id',
    component: ConfigureEntitiesFormComponent
  },
  {
    path: 'configureEntities/edit/:id',
    component: ConfigureEntitiesFormComponent
  },
  {
    path: 'generateReport',
    component: CommissionReportListComponent
  },
  {
    path: 'generateReport/:id',
    component: CommissionReportFormComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }