<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
    <xsl:output method="html" doctype-public="XSLT-compat" omit-xml-declaration="yes" encoding="UTF-8" indent="yes" />

    <xsl:template match="/">
        <hmtl>
            <body>
                <ul>
                    <xsl:apply-templates select="diccionarios" />
                </ul>
            </body>
        </hmtl>
    </xsl:template>

    <xsl:template match="/diccionarios/diccionario">
        <li>
            <xsl:apply-templates select="siglas" />
            :
            <xsl:apply-templates select="nombre" />
        </li>
    </xsl:template>
</xsl:transform>

<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
    <xsl:output method="html" doctype-public="XSLT-compat" omit-xml-declaration="yes" encoding="UTF-8" indent="yes" />

    <xsl:template match="/">
        <hmtl>
            <body>
                <xsl:apply-templates select="diccionarios/diccionario/definicion" />
            </body>
        </hmtl>
    </xsl:template>

    <xsl:template match="/diccionarios/diccionario/definicion">
        <p>
            <xsl:apply-templates select="palabra" />
            :
            <xsl:apply-templates select="def" />

        </p>
    </xsl:template>
</xsl:transform>

<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
    <xsl:output method="html" doctype-public="XSLT-compat" omit-xml-declaration="yes" encoding="UTF-8" indent="yes" />

    <xsl:template match="/listado">
        <xsl:for-each select="cuenta">
            <xsl:element name="cuentas">
                <xsl:element name="cuenta">
                    <xsl:attribute name="dnititular" select="titular/@dni" />
                </xsl:element>
                <xsl:element name="creacion">
                    <xsl:value-of select="fechacreacion" />
                </xsl:element>
                <xsl:element name="titular">
                    <xsl:value-of select="titular" />
                </xsl:element>
                <xsl:element name="saldoactual">
                    <xsl:value-of select="saldoactual" />
                    <xsl:value-of select="saldoactual/@moneda" />
                </xsl:element>
            </xsl:element>
        </xsl:for-each>
        <xsl:for-each select="fondo">
            <xsl:element name="fondos">
                <xsl:element name="fondo">
                    <xsl:attribute name="cuentaasociada" select="fondo/cuentaasociada" />
                    <xsl:element name="cantidaddepositada">
                        <xsl:value-of select="fondo/datos/cantidaddepositada" />
                    </xsl:element>
                    <xsl:element name="moneda">
                        <xsl:value-of select="fondo/datos/moneda" />
                    </xsl:element>
                </xsl:element>
            </xsl:element>
        </xsl:for-each>
    </xsl:template>
</xsl:transform>