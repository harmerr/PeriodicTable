import { Component, OnInit } from '@angular/core';
import { Element } from '../../element.model'
import { ElementService } from '../../element.service';
import { Observable } from 'rxjs';
import { Input } from '@angular/core';

@Component({
  selector: 'app-element-details',
  templateUrl: './element-details.component.html',
  styleUrls: ['./element-details.component.css']
})
export class ElementDetailsComponent implements OnInit {

  //Annotation needed to link with table 
  @Input() elementDetails$ !: Element;

  constructor(private service : ElementService) { }

  ngOnInit(): void { }

}
