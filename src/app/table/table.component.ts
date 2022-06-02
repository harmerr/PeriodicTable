import { Component, OnInit, ViewChild } from '@angular/core';
import { Element } from '../element.model';
import { ElementService } from '../element.service';
import { ElementDetailsComponent } from './element-details/element-details.component';


@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent implements OnInit {

  details$ !: Element; //
  isShowing : boolean = false;

  constructor(private service : ElementService) { }

  ngOnInit(): void {
    const blocks = document.querySelectorAll("td")
    
    for(var i = 0; i < blocks.length; i++) {
      blocks[i].onclick = (e) => {
        const clicked : any = e.currentTarget
        const span = clicked.querySelector("span").innerHTML
        console.log(span)

        this.getElement(span);
        this.isShowing = true;
      }
    }
    
  }

  getElement(atomicNum : number) : void {
    this.service.getElementByNum(atomicNum).subscribe(element => { 
    
      this.details$ = element
    });
  }

  
}
