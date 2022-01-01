import { Component, OnInit } from '@angular/core';
import { SalesPerson } from './sales-person';

@Component({
  selector: 'app-sales-person-list',
  templateUrl: './sales-person-list.component.html',
  styleUrls: ['./sales-person-list.component.css']
})
export class SalesPersonListComponent implements OnInit {

// create an array of objects

salesPersonList: SalesPerson[] = [
        new SalesPerson("Anup","Kumar","anupkumar@gmail.com",120000),
        new SalesPerson("John","Doe","John.doe@gmail.com",130000),
        new SalesPerson("Clarie","Murphy","clarie.murphy@gmail.com",900000)
];

  constructor() { }

  ngOnInit(): void {
  }

}
