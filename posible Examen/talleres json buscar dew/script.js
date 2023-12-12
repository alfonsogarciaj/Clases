
function cargarJSON() {
    return fetch('Talleres.json')
      .then(response => response.json())
      .then(data => {
        return data.Talleres;
      })
      .catch(error => {
        console.error('Error al cargar el JSON:', error);
      });
  }

  function filtrarTalleres() {
    const cilindrada = document.getElementById('cilindrada').value;
    const tipoCombustible = document.getElementById('tipocombustible').value;
    const añoFabricacion = document.getElementById('año_fabricacion').value;
    const talleresFiltrados = talleresJson.filter(taller => {
      return (
        (cilindrada === "Todos" || taller.cilindrada === cilindrada) &&
        (tipoCombustible === "Todos" || taller.tipocombustible === tipoCombustible) &&
        (!añoFabricacion || taller.añofabricacion <= añoFabricacion)
      );
    });
    mostrarResultados(talleresFiltrados);
  }

  function mostrarResultados(talleres) {
    const resultadosDiv = document.getElementById('resultados');
    resultadosDiv.innerHTML = '';
  
    if (talleres.length === 0) {
      resultadosDiv.innerHTML = '<p>No se encontraron talleres que coincidan con los criterios de búsqueda.</p>';
    } else {
      talleres.forEach(taller => {
        const nombre = taller.nombre;
        const tiposReparacion = taller.tiposreparacion;
        const resultadoElement = document.createElement('div');
        resultadoElement.innerHTML = `<p><strong>${nombre}</strong> - ${tiposReparacion}</p>`;
        resultadosDiv.appendChild(resultadoElement);
      });
    }
  }

  function inicializar() {
    cargarJSON()
      .then(data => {
        talleresJson = data;
        document.getElementById('searchForm').addEventListener('submit', function (event) {
          event.preventDefault();
          filtrarTalleres();
        });
      });
  }

  window.onload = inicializar;
  