<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="html" version="4.0" encoding="UTF-8" indent="yes" />

   <!-- Plantilla raíz -->
  <xsl:template match="/">
    <html>
      <body>
        <ol>
          <xsl:apply-templates select="bib/libro" />
        </ol>
      </body>
    </html>
  </xsl:template>

  <!-- Plantilla libro -->
  <xsl:template match="/bib/libro">
    <xsl:choose>
      <xsl:when test="precio &lt; 100">
        <li><xsl:apply-templates select="titulo" /></li>
      </xsl:when>
    </xsl:choose>
  </xsl:template>

  <!-- Plantilla titulo -->
  <xsl:template match="/bib/libro/titulo">
    <xsl:value-of select="." />
  </xsl:template>

</xsl:stylesheet>