<img src="https://0901.static.prezi.com/preview/v2/bnspo3k7juaoauzunuhknk6rux6jc3sachvcdoaizecfr3dnitcq_3_0.png" width="170" height="100"/>

Alfonso García Jorge 

# *Receta de Cocina*

#### Se pide

Diseñar un documento válido en XML que permita estructurar la información de las recetas de cocina de un restaurante y aplicarlo a la siguiente receta de cocina. Hay que hacerlo de modo que un sistema informático pueda realizar búsquedas por ingredientes, cantidad de comensales o nombre de la receta.


<img src="https://user-images.githubusercontent.com/91060831/135651115-f866ecfc-e7a7-4656-9a61-e19e7ad1d914.png" width="200" height="150"/>


```bash
<receta>
      <nombre>Sopa de cebolla/>

	<comensales > 4/>

	      <ingredientes>

		     <ingrediente cantidad= "1" unidad ="kg."> "Cebolla"/>
		     <ingrediente cantidad= "2" unidad = "l."> "Caldo de Carne"/>
		     <ingrediente cantidad= "100 " unidad ="gr."> "Mantequilla"/>
		     <ingrediente cantidad= "1" unidad = "cucharada"> "Harina"/>
		     <ingrediente cantidad= "100" unidad= "gr."> "Queso Emmental Suizo o Gruyére Rallado"/>
		     <ingrediente unidad= "en rebanadas"> "Pan tostado"/>
		     <ingrediente> "Tomillo"/>
		     <ingrediente cantidad= "1" unidad= "hoja"> "Laurel"/>
		     <ingrediente> "Pimienta"/>

		</ingredientes>


        <proceso>

        <primerpaso = "Pelar y partir las cebollas en rodajas finas"/>
        <segundopaso = "Rehogarlas con la mantequilla, sal y pimienta a fuego lento hasta 
	               que estén transparentes sin dorarse"/>
        <tercerpaso = "Añadir la harina sin dejar de remover"/>
        <cuartopaso = "Ponerlo en una cazuela con el caldo, el tomillo y el laurel"/>
        <quintopaso = "dejar cocer a fuego lento durante unos 15 minutos"/>
        <sextopaso = "Poner las rebanadas de pan encima, espolvorear el queso y gratinar al horno"/>

        </proceso>

</receta>

```
### Proceso:  

Abrimos  la  receta  y  le  damos  el  nombre  del  plato,  a  continuación,  los  comensales 
predeterminados  para  esta  receta.  Luego  abrimos  los  ingredientes  y  ponemos  primero  la 
cantidad correspondiente de cada ingrediente y el ingrediente a utilizar, cuando tengamos todos 
los  ingredientes  cerramos  este.  Finalmente  abrimos  proceso  y  escribimos  paso  a  paso  el 
proceso. Para terminar nuestra receta en XML la cerramos </receta>. 


<div align="center">
 
![551469b208b4e3f2c6fdee330e6c71fe](https://user-images.githubusercontent.com/91060831/135711943-cfdba417-0912-4540-b3f8-6d12980dce0a.gif)
