import { Component, OnInit } from '@angular/core';
import { Department } from '../department';
import { DepartmentService } from '../department.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-department-list',
  templateUrl: './department-list.component.html',
  styleUrls: ['./department-list.component.css']
})
export class DepartmentListComponent implements OnInit
{
  departments! : Department[];
  
  constructor(private departmentService: DepartmentService,private router: Router)
  {

  }
  
  ngOnInit(): void {
    this.getDepartments();
    
  }

  private getDepartments()
  {
    this.departmentService.getDeprtmentList().subscribe(data =>{
      this.departments=data;
    })
  }
  

  departmentDetails(id: number) {
    this.router.navigate(['department-details', id]);
  }
  updateDepartment(id:number) {
    this.router.navigate(['update-department', id]);
  }

  deleteDepartment(id:number)
  {
    this.departmentService.deleteDepartment(id).subscribe(data=>{console.log(data);this.getDepartments;})
  }
  

}
