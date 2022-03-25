<img src="https://user-images.githubusercontent.com/91060831/136633965-7280c0c8-a144-4d55-838e-1ace7794c691.png" width="190" height="80"/>

*Alfonso García Jorge*

# Se pide

Proporcionar un XML schema: 

<img src="https://camo.githubusercontent.com/cd9c14c5ea6ad713eaf95484f8f298056acf80f1f344c61c798dfaf2578d0362/68747470733a2f2f36643031333166392d612d36326362336131612d732d73697465732e676f6f676c6567726f7570732e636f6d2f736974652f746f646f786d6c6474642f656a6572636963696f732f656e756e636961646f732f33352d656a6572636963696f732d786d6c736368656d612d6176616e7a61646f732f656a6572636963696f2d786d6c736368656d612d6176616e7a61646f2d342d6f6274656e65722d736368656d612d612d7061727469722d64652d756e612d6a65726172717569612d64652d6461746f732f65737175656d612e6a70673f617474616368617574683d414e6f593763704175336239616c68655a626f576e5a44625a686666714c303059533076326856654646764a65353468306367305856376e4a716b386a2d546932736932506f667456515942744634667065666936395a394b733148633077524b596b5163356a466b6b33626f53384c317270466c734c794530545f36583377746f6378343637745778436578457468396d597351486b4448314e63446469495654344f723865335f7679566832586c5748596a526c347a494a79656e6f6e656f4c48704651354159354c6a3155756a704661693373645874766e31303846774d306876675376467946677a3635462d774141755264386c774d366a3556517551664464735648327744316b6144734e7a514e6e6942346d765741533251715f686f717866355a447852797a34524a756733716a474b4a61424e456e456e7839304a7358374f44444e316b437867685652773650454552464f536742426659543846684555776d4a39462d4e5a533673794e68744a346f7a6a2d783775574e2d7364484d614f55775f4f4c464b5875426a665533326a52626461427a434872304a41253344253344266174747265646972656374733d30" width="530" height="280"/>




```bash
<?xml version="1.0" encoding="ISO-8859-1"?>
<xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema">

 <xsd:element name="nombre" type="tipoNombre"/>
 <xsd:element name="apellidos" type="tipoNombre"/>
 <xsd:element name="calle" type="tipoNombre"/>
 <xsd:element name="poblacion" type="tipoNombre"/>
 <xsd:element name="provincia" type="tipoNombre"/>

 <xsd:element name="tipoNombre">
 <xsd:restriction base="xsd:string">
 </xsd:restriction>

 <xsd:element name="nacimiento">
 <xsd:complexType>
 <xsd:simpleContent>
 <xsd:extension base="xsd:string">
 <xsd:attribute name="dia" type="tipoDia"/>
 <xsd:attribute name="mes" type="tipoMes"/>
 <xsd:attribute name="anyo" type="tipoAnyo"/>
 </xsd:extension>
 </xsd:simpleContent>
 </xsd:complexType>
 </xsd:element>

 </xsd:simpleType>
 <xsd:simpleType name="tipoDia">
 <xsd:minInclusive value="1"/>
 <xsd:maxInclusive value="31"/>
 </xsd:restriction>
 </xsd:simpleType>

   <xsd:simpleType name="tipoMes">
      <xsd:restriction base="xsd:string">
 <xsd:enumeration value="Enero"/>
 <xsd:enumeration value="Febrero"/>
 <xsd:enumeration value="Marzo"/>
 <xsd:enumeration value="Abril"/>
 <xsd:enumeration value="Mayo"/>
 <xsd:enumeration value="Junio"/>
 <xsd:enumeration value="Julio"/>
 <xsd:enumeration value="Agosto"/>
 <xsd:enumeration value="Septiembre"/>
 <xsd:enumeration value="Octubre"/>
 <xsd:enumeration value="Noviembre"/>
 <xsd:enumeration value="Diciembre"/>
 </xsd:restriction>
</xsd:simpleType>

 <xsd:simpleType name="tipoAnyo">
 <xsd:minInclusive value="1900"/>
 <xsd:maxInclusive value="2011"/>
 </xsd:restriction>
 </xsd:simpleType>


 <xsd:simpleType name="tipoCodPostal">
 <xsd:restriction base="xsd:positiveInteger">
 <xsd:totalDigits value="5"/>
 </xsd:restriction>
 </xsd:simpleType>

 <xsd:element name="direccion">
 <xsd:complexType>
 <xsd:sequence>
 <xsd:element ref="calle" maxOccurs="unbounded"/>
 <xsd:element ref="poblacion" maxOccurs="unbounded"/>
 <xsd:element ref="provincia" maxOccurs="unbounded"/>
 <xsd:element ref="cpostal" maxOccurs="unbounded"/>
 </xsd:sequence>
 </xsd:complexType>
 </xsd:element>

 <xsd:element name="varon"/>
 <xsd:element name="hembra"/>
 <xsd:element name="cpostal" type="tipoCodPostal"/>

 </xsd:element>

</xsd:schema>



<?xml version='1.0' encoding="ISO-8859-1"?>
<personas xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 xsi:noNamespaceSchemaLocation="XMLSchemaAvanzados04_personas.xsd">
 <persona>
    <nombre>Juan Pardo</nombre>
    <nacimiento dia="10" mes="Abril" anyo="1982"/>
    <direccion>
       <calle>Caoba, 1</calle>
       <poblacion>Madrid</poblacion>
       <provincia>Madrid</provincia>
       <cpostal>28005</cpostal>
    </direccion>
    <varon />
 </persona>
 <persona>
    <nombre>María López</nombre>
    <direccion>
       <calle>Roncato, 1</calle>
       <poblacion>Illescas</poblacion>
       <provincia>Toledo</provincia>
       <cpostal>45200</cpostal>
    </direccion>
    <direccion>
       <calle>Paseo de la Esperanza, 15 - 1º A</calle>
       <poblacion>Madrid</poblacion>
       <provincia>Madrid</provincia>
       <cpostal>28005</cpostal>
    </direccion>
    <hembra />
 </persona>
</personas>

```
