package calculadoramaven.calculadora.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class BasicOperationsController {

    private int memoria = 0;

    //Suma
    @GetMapping("/sumarint")
    public int sumar(@RequestParam(name = "a", required = true) int a, @RequestParam(name = "b", required = true) int b) {
        return a + b;
    }
    @GetMapping("/sumarlong")
    public long sumar(@RequestParam(name = "a", required = true) long a, @RequestParam(name = "b", required = true) long b) {
        return a + b;
    }
    @GetMapping("/sumarfloat")
    public float sumar(@RequestParam(name = "a", required = true) float a, @RequestParam(name = "b", required = true) float b) {
        return a + b;
    }
    @GetMapping("/sumardouble")
    public double sumar(@RequestParam(name = "a", required = true) double a, @RequestParam(name = "b", required = true) double b) {
        return a + b;
    }

    //Resta
    @GetMapping("/restarint")
    public int restar(@RequestParam(name = "a", required = true) int a, @RequestParam(name = "b", required = true) int b) {
        return a - b;
    }
    @GetMapping("/restarlong")
    public long restar(@RequestParam(name = "a", required = true) long a, @RequestParam(name = "b", required = true) long b) {
        return a - b;
    }
    @GetMapping("/restarfloat")
    public float restar(@RequestParam(name = "a", required = true) float a, @RequestParam(name = "b", required = true) float b) {
        return a - b;
    }
    @GetMapping("/restardouble")
    public double restar(@RequestParam(name = "a", required = true) double a, @RequestParam(name = "b", required = true) double b) {
        return a - b;
    }

    //Multiplicacion
    @GetMapping("/multiplicarint")
    public int multiplicar(@RequestParam(name = "a", required = true) int a, @RequestParam(name = "b", required = true) int b) {
        return a * b;
    }
    @GetMapping("/multiplicarlong")
    public long multiplicar(@RequestParam(name = "a", required = true) long a, @RequestParam(name = "b", required = true) long b) {
        return a * b;
    }
    @GetMapping("/multiplicarfloat")
    public float multiplicar(@RequestParam(name = "a", required = true) float a, @RequestParam(name = "b", required = true) float b) {
        return a * b;
    }
    @GetMapping("/multiplicardouble")
    public double multiplicar(@RequestParam(name = "a", required = true) double a, @RequestParam(name = "b", required = true) double b) {
        return a * b;
    }

    //Dividir
    @GetMapping("/dividir")
    public Object dividir(@RequestParam(name = "a", required = true) String a, @RequestParam(name = "b", required = true) String b) {
        try {
            return Double.valueOf(a) / Double.valueOf(b);
        } catch (Exception ignored) {
        }
        try {
            return Float.valueOf(a) / Float.valueOf(b);
        } catch (Exception ignored) {
        }
        try {
            return Long.valueOf(a) / Long.valueOf(b);
        } catch (Exception ignored) {
        }
        try {
            return Integer.valueOf(a) / Integer.valueOf(b);
        } catch (Exception ignored) {
        }
        return 0;
    }

    @PostMapping("/guardar")
    public int guardar(@RequestParam(name = "m", required = true) int m) {
        this.memoria = m;

        return this.memoria;
    }
    @GetMapping("/recuperar")
    public int recuperar() {
        return this.memoria;
    }

    @RequestMapping("/hello")
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }

}