import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateEmployeeComponent } from './create-employee/create-employee.component';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { EmployeeDetailsComponent } from './employee-details/employee-details.component';
import { FormsModule } from '@angular/forms';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { DepartmentListComponent } from './department-list/department-list.component';
import { DepartmentDetailsComponent } from './department-details/department-details.component';
import { UpdateDepartmentComponent } from './update-department/update-department.component';
import { CreateDepartmentComponent } from './create-department/create-department.component';


@NgModule({
  declarations: [
    AppComponent,
    CreateEmployeeComponent,
    UpdateEmployeeComponent,
    EmployeeListComponent,
    EmployeeDetailsComponent,
    DepartmentListComponent,
    DepartmentDetailsComponent,
    UpdateDepartmentComponent,
    CreateDepartmentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
