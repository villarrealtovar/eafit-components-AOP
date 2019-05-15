# eafit-components-AOP
AOP: Aspect Oriented Programming

## ¿Qué es un joinpoint estático en AspectJ? ¿Cómo se utilizan?

"Dado que Aspect-oriented programming (AOP) es un paradigma de programación muy reciente [...] la AOP  se centró en un modelo de ***jointpoints estáticos***, lo cual significa que los aspectos pueden ser solamente invocados en puntos ```estáticos``` dentro de la estructura de la aplicación. Posteriormente, también fue posible invocar aspectos cuando ciertas condiciones ```dinámicas``` fueran evaluadas y  se cumplieran. Actualmente, las implementaciones de AOP ofrecen por lo tanto un modelo de ***joinpoints dinámicos***. Esto es un modelo donde los jointpoints pueden ser basados en eventos en runtime en la ejecución del programa".

"Un elemento importante en el diseño de lenguajes AOP es su modelo de joinpoint. ***AspectJ*** se basa en un modelo de joinpoint dinámico lo cual significa que los joinpoints son puntos bien definidos en la ejecución de un programa, y no solamente en la estructura estática del programa. Por ejemplo, es posible capturar cierto joinpoints solamente si ellos están el flujo del control de otro joinpoint. Otra posiibilidad con joinpoints dinámicos es que bajo ciertas conditiones en tiempos de ejecución puede ser especificado un pointcut. El pointcut solo concondará si la la condición es satisfecha [https://soft.vub.ac.be/~njonchee/theses/thesis_dimitri.pdf]

De acuerdo a [http://st.inf.tu-dresden.de/files/teaching/ss16/cbse/slides/44-cbse-aspectj.pdf] un *static Joinpoint* son puntos especiales en el codigos, hooks o puntos que sirven de extensión.

De esta manera, los ```Static JoinPoints```son posiciones en el código los cuales pueden ser manejados y extendidos por el weaver. Un ```Advice``` puede extender de un Static JoinPoint

