import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, FormsModule],
  template: `
    
        <div class="container">
          <h1>Product Manager</h1>
    
          <div class="tabs">
            <button (click)="activeTab = 'list'">View Products</button>
            <button (click)="activeTab = 'add'">Add Product</button>
            <button [disabled]="!selectedProduct" (click)="activeTab = 'details'">
              View Details
            </button>
          </div>
    
          <!-- Product List -->
          <div *ngIf="activeTab === 'list'" class="tab">
            <div *ngFor="let product of products" class="card" (click)="selectProduct(product)">
              <img [src]="product.picture" alt="{{product.title}}" />
              <h3>{{ product.title }}</h3>
              <p>\${{ product.price }}</p>
            </div>
          </div>
    
          <!-- Add Product -->
          <div *ngIf="activeTab === 'add'" class="tab">
            <h2>Add New Product</h2>
            <form (ngSubmit)="addProduct()">
              <input [(ngModel)]="newProduct.title" name="title" placeholder="Title" required />
              <input [(ngModel)]="newProduct.price" name="price" placeholder="Price" type="number" required />
              <input [(ngModel)]="newProduct.picture" name="picture" placeholder="Picture URL" required />
              <textarea [(ngModel)]="newProduct.description" name="description" placeholder="Description"></textarea>
              <button type="submit">Add</button>
            </form>
          </div>
    
          <!-- Product Details -->
          <div *ngIf="activeTab === 'details' && selectedProduct" class="tab">
            <h2>{{ selectedProduct?.title }}</h2>
            <img [src]="selectedProduct?.picture" alt="{{selectedProduct?.title}}" />
            <p><b>Price:</b> \${{ selectedProduct?.price }}</p>
            <p><b>Description:</b> {{ selectedProduct?.description }}</p>
          </div>
        </div>
      

  `,
  styles: [
    `
    
        .container { max-width: 800px; margin: auto; font-family: Arial, sans-serif; }
        h1 { text-align: center; }
        .tabs { display: flex; justify-content: center; margin: 20px 0; }
        .tabs button { margin: 0 5px; padding: 8px 16px; border: none; background: #007bff; color: white; cursor: pointer; border-radius: 4px; }
        .tabs button:disabled { background: gray; cursor: not-allowed; }
        .tab { margin-top: 20px; }
        .card { display: inline-block; width: 180px; margin: 10px; padding: 10px; border: 1px solid #ddd; border-radius: 8px; cursor: pointer; text-align: center; transition: box-shadow 0.3s; }
        .card:hover { box-shadow: 0 2px 8px rgba(0,0,0,0.2); }
        .card img { max-width: 100%; border-radius: 4px; }
        form { display: flex; flex-direction: column; gap: 10px; }
        input, textarea { padding: 8px; border: 1px solid #ccc; border-radius: 4px; }
        button[type="submit"] { background: green; color: white; padding: 8px; border: none; border-radius: 4px; cursor: pointer; }
      

    `,
  ],
})
export class AppComponent {
  activeTab: 'list' | 'add' | 'details' = 'list';
  selectedProduct: Product | null = null;
  products: Product[] = [];
  newProduct: Product = { title: '', price: 0, picture: '', description: '' };
  selectProduct(product: Product) {
    this.selectedProduct = product;
    this.activeTab = 'details';
  }
  addProduct() {
    if (this.newProduct.title && this.newProduct.picture) {
    this.products.push/*postfix:PostfixUnknown*/;
    this.newProduct = { title: '', price: 0, picture: '', description: '' };
    this.activeTab = 'list';
    }
  }
}

