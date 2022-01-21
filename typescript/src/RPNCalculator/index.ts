export class RPNCalculator {
    private operation: Operation;
    private operations = {
        "+": new Add(),
        "-": new Subtract(),
        "*": new Multiply(),
        "/": new Divide(),
        "SQRT": new SquareRoot()
    }

    calculate(param: string): number {
        let result: number;
        const params: string[] = param.split(' ');

        if (params.length > 1) {
            const partCalcul: number[] = [];
            params.forEach(param => {
                const operateurs = Object.keys(this.operations);
                if (operateurs.includes(param)) {
                    const secondNumber = partCalcul.pop();
                    const firstNumber = partCalcul.pop();
                    this.operation = this.operations[param];
                    result = this.operation.calculate(firstNumber, secondNumber);
                    partCalcul.push(result);
                } else {
                    partCalcul.push(parseInt(param));
                }
            });
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

export class Divide implements Operation {
    calculate(nombre1: number, nombre2: number): number {
        return nombre1 / nombre2;
    }
}

export class SquareRoot implements Operation {
    calculate(nombre1: number, nombre2: number): number {
        return Math.sqrt(nombre2) ;
    }
}
