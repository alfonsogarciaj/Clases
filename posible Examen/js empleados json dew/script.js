document.addEventListener('DOMContentLoaded', function () {
  document.getElementById('encuentroForm').addEventListener('click', mostrarPersonasSeleccionadas);
});

function mostrarPersonasSeleccionadas() {
  const cargoSeleccionado = document.getElementById('cargo').value;
  const categoriaSeleccionada = document.getElementById('categoria').value;
  const tipoTrabajoSeleccionado = document.getElementById('tipoTrabajo').value;

  const url = 'empleados.json';

  fetch(url)
    .then(response => response.json())
    .then(data => {
      const empleadosFiltrados = data.filter(empleado => {
        return (
          (cargoSeleccionado === '' || empleado.Cargo === cargoSeleccionado) &&
          (categoriaSeleccionada === '' || empleado.Categoría === categoriaSeleccionada) &&
          (tipoTrabajoSeleccionado === '' || empleado['Tipo de Trabajo'] === tipoTrabajoSeleccionado)
        );
      });
      mostrarResultados('resultado', empleadosFiltrados);
    })
    .catch(error => console.error('Error al obtener datos:', error));
}

function mostrarResultados(contenedorId, resultados) {
  const contenedor = document.getElementById(contenedorId);

  contenedor.innerHTML = '';

  if (resultados.length === 0) {
    contenedor.innerHTML = 'No se encontraron resultados.';
    return;
  }

  resultados.forEach(resultado => {
    const elementoResultado = document.createElement('div');
    elementoResultado.classList.add('resultado-item');

    const contenidoResultado = `
      <p><strong>Nombre:</strong> ${resultado.Nombre}</p>
      <p><strong>Cargo:</strong> ${resultado.Cargo}</p>
      <p><strong>Edad:</strong> ${resultado.Edad}</p>
      <p><strong>Tipo de Trabajo:</strong> ${resultado['Tipo de Trabajo']}</p>
    `;

    elementoResultado.innerHTML = contenidoResultado;
    contenedor.appendChild(elementoResultado);
  });
}
