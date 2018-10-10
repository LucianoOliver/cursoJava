#!/bin/bash

WD=$PWD

function gerarRelatorio() {
	cd $1
	[ -f "$2.pdf" ] && rm $2.pdf
	pandoc -f markdown_github -t pdf -t latex -o $2.pdf $2.md
	cd $WD
}

gerarRelatorio diagramas exercicios
gerarRelatorio questionario questionario
gerarRelatorio documentos palavras-chave-heranca
gerarRelatorio documentos access-levels
