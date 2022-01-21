export class RPNCalculator {
    private operation: Operation;
    private operations = {
        "+": new Add(),
        "-": new Subtract(),
        "*": new Multiply()
    }

    calculate(param: string): number {
        let result: number;
        const params: string[] = param.split(' ');

        if (params.length > 1) {
            const operateur: string = params[2];
            this.operation = this.operations[operateur];
            result = this.operation.calculate(this.parseInt(params[0]), this.parseInt(params[1]));
        } else {
            result = parseInt(param);
        }
        return result;
    }

    parseInt(param: string): number {
       return Number.parseInt(param);
    }
}

export interface Operation {
    calculate(nombre1: number, nombre2: number): number;
}

export class Add implements Operation {
    calculate(nombre1: number, nombre2: number): number {
        return nombre1 + nombre2;
    }
}

export class Subtract implements Operation {
    calculate(nombre1: number, nombre2: number): number {
        return nombre1 - nombre2;
    }
}

export class Multiply implements Operation {
    calculate(nombre1: number, nombre2: number): number {
        return nombre1 * nombre2;
    }
}
