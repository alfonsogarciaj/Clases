<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output encoding="UTF-8" indent="yes" method="html" version="5.0"/>
	<xsl:template match="/">
		<html>
			<head/>
			<body>
				<xsl:apply-templates select="catalogo/cds"/>
			</body>
		</html>
	</xsl:template>
	<xsl:template match="/catalogo/cds">
		<table>
			<xsl:apply-templates select="cd"/>
		</table>
	</xsl:template>
	<xsl:template match="/catalogo/cds/cd">
		<tr>
			<xsl:choose>
				<xsl:when test="año &gt; 2000">
					<td>
						<font color="green"/>
						<xsl:apply-templates select="titulo"/>
					</td>
				</xsl:when>
				<xsl:otherwise>
					<td>
						<font color="red"/>
						<xsl:apply-templates select="titulo"/>
					</td>
				</xsl:otherwise>
			</xsl:choose>
		</tr>
	</xsl:template>
</xsl:stylesheet>