package calculadoramaven.calculadora.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class BasicOperationsController {

    private int memoria = 0;
    private double memoriadouble = 0f;

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
        return dividirObject(a, b);
    }

    @PostMapping("/guardar")
    public String guardar(@RequestParam(name = "m", required = true) String m) {


        try {
            memoria = Integer.valueOf(m);
            return "guardado int " + memoria;
        } catch (Exception ignored) {
        }
        try {
            memoriadouble = Double.valueOf(m);
            return "guardado double " + memoriadouble;
        } catch (Exception ignored) {
        }
        return "no se guardo nada";
    }



    @PostMapping("/dividir")
    public Object dividirPost(@RequestParam(name = "a", required = true) String a, @RequestParam(name = "b", required = true) String b) {
        return dividirObject(a, b);
    }

    private Object dividirObject(@RequestParam(name = "a", required = true) String a, @RequestParam(name = "b", required = true) String b) {
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

    @PostMapping("/multiplicar")
    public Object multiplicarPost(@RequestParam(name = "a", required = true) String a, @RequestParam(name = "b", required = true) String b) {
        return multiplicarObject(a, b);
    }
    private Object multiplicarObject(@RequestParam(name = "a", required = true) String a, @RequestParam(name = "b", required = true) String b) {
        try {
            return Double.valueOf(a) * Double.valueOf(b);
        } catch (Exception ignored) {
        }
        try {
            return Float.valueOf(a) * Float.valueOf(b);
        } catch (Exception ignored) {
        }
        try {
            return Long.valueOf(a) * Long.valueOf(b);
        } catch (Exception ignored) {
        }
        try {
            return Integer.valueOf(a) * Integer.valueOf(b);
        } catch (Exception ignored) {
        }
        return 0;
    }


    @PostMapping("/restar")
    public Object restarPost(@RequestParam(name = "a", required = true) String a, @RequestParam(name = "b", required = true) String b) {
        return restarObject(a, b);
    }
    private Object restarObject(@RequestParam(name = "a", required = true) String a, @RequestParam(name = "b", required = true) String b) {
        try {
            return Double.valueOf(a) - Double.valueOf(b);
        } catch (Exception ignored) {
        }
        try {
            return Float.valueOf(a) - Float.valueOf(b);
        } catch (Exception ignored) {
        }
        try {
            return Long.valueOf(a) - Long.valueOf(b);
        } catch (Exception ignored) {
        }
        try {
            return Integer.valueOf(a) - Integer.valueOf(b);
        } catch (Exception ignored) {
        }
        return 0;
    }

    @PostMapping("/sumar")
    public Object sumarPost(@RequestParam(name = "a", required = true) String a, @RequestParam(name = "b", required = true) String b) {
        return sumarObject(a, b);
    }
    private Object sumarObject(@RequestParam(name = "a", required = true) String a, @RequestParam(name = "b", required = true) String b) {
        try {
            return Double.valueOf(a) + Double.valueOf(b);
        } catch (Exception ignored) {
        }
        try {
            return Float.valueOf(a) + Float.valueOf(b);
        } catch (Exception ignored) {
        }
        try {
            return Long.valueOf(a) + Long.valueOf(b);
        } catch (Exception ignored) {
        }
        try {
            return Integer.valueOf(a) + Integer.valueOf(b);
        } catch (Exception ignored) {
        }
        return 0;
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