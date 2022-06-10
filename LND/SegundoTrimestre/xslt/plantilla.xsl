<?xml version="1.0" encoding="UTF-8" ?>
<xsl:transform xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
    <xsl:output method="html" doctype-public="XSLT-compat" omit-xml-declaration="yes" encoding="UTF-8" indent="yes" />

    <xsl:template match="/">
      <hmtl>
        <head>
          <title>New Version!</title>
        </head>
        <xsl:apply-templates/>
      </hmtl>
    </xsl:template>

    <xsl:template match="@*|node()">
        <xsl:copy>
            <xsl:apply-templates select="@*|node()"/>
        </xsl:copy>
    </xsl:template>
</xsl:transform>


<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
    <xsl:output method="html" doctype-public="XSLT-compat" omit-xml-declaration="yes" encoding="UTF-8" indent="yes" />

    <xsl:template match="/">
        <xsl:for-each select="">
            <xsl:element name="">
                <xsl:element name="">
                    <xsl:attribute name="" select="" />
                </xsl:element>
                <xsl:element name="">
                    <xsl:value-of select="" />
                </xsl:element>
            </xsl:element>
        </xsl:for-each>
    </xsl:template>
</xsl:transform>