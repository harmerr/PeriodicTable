import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TableComponent } from './table/table.component';
import { ElementDetailsComponent } from './table/element-details/element-details.component';
import { ElementService } from './element.service';

@NgModule({
  declarations: [
    AppComponent,
    TableComponent,
    ElementDetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [ElementService],
  bootstrap: [AppComponent]
})
export class AppModule { }
