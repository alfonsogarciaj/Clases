document.addEventListener('DOMContentLoaded', function () {
  document.getElementById('edadCategoriaForm').addEventListener('click', mostrarEmpleadosMenores);
});

function mostrarEmpleadosMenores() {
  const edadSeleccionada = document.getElementById('edad').value;
  const categoriaEdadSeleccionada = document.getElementById('categoriaEdad').value;

  const url = 'empleados.json';

  fetch(url)
    .then(response => response.json())
    .then(data => {
      const empleadosFiltrados = data.filter(empleado => {
        return (
          (edadSeleccionada === '' || parseInt(empleado.Edad) <= parseInt(edadSeleccionada)) &&
          (categoriaEdadSeleccionada === '' || empleado.Categoría === categoriaEdadSeleccionada)
        );
      });
      mostrarResultadosEdad('resultadoEdad', empleadosFiltrados);
    })
    .catch(error => console.error('Error al obtener datos:', error));
}

function mostrarResultadosEdad(contenedorId, resultados) {
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
