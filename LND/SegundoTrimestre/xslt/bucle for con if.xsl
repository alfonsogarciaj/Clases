
<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output encoding="UTF-8" indent="yes" method="html" version="5.0"/>
  <xsl:template match="/">
  	<html>
  		<head/>
  		<body>
  			<ol>
  				<xsl:for-each select="catalogo/artistas/artista">
  					<xsl:if test="nacionalidad = 'España'">
  						<li>
  							<xsl:value-of select="nombre"/>
  						</li>
  					</xsl:if>
  				</xsl:for-each>
  			</ol>
  		</body>
  	</html>
  </xsl:template>
</xsl:stylesheet>