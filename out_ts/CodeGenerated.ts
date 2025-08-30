import { Component } from '@angular/core';
import { ModuleB } from './moduleB';
import { ModuleA } from './moduleA';

@Component({
  selector: 'app-a',
  template: `
    <div>Module A</div>

  `,
})
export class ModuleA {
  b: ModuleA;
}

@Component({
  selector: 'app-b',
  template: `
    <div>Module B</div>

  `,
})
export class ModuleB {
  a: ModuleB;
}

