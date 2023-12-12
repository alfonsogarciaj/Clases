document.addEventListener('DOMContentLoaded', function () {
    const userForm = document.getElementById('user-form');
    const userTable = document.getElementById('user-table');
    const userList = document.getElementById('user-list');
    const registrarUsuarioButton = document.getElementById('registrar-usuario');
    const borrarDatosButton = document.getElementById('borrar-datos');
    const consultarUsuarioButton = document.getElementById('consultar-usuario');
    const consultarUltimoLoginButton = document.getElementById('consultar-ultimo-login');
    const usuariosRegistrados = {};
  
    function guardarUsuario(nickname, nombre, password, dni, edad) {
      const fechaAlta = new Date();
      usuariosRegistrados[nickname] = {
        nombre,
        password,
        dni,
        edad,
        fechaAlta,
      };
    }
  
    function mostrarUsuariosRegistrados() {
      userList.innerHTML = '';
      for (const nickname in usuariosRegistrados) {
        const usuario = usuariosRegistrados[nickname];
        const row = document.createElement('tr');
        row.innerHTML = `
          <td>${nickname}</td>
          <td>${usuario.nombre}</td>
          <td>${usuario.dni}</td>
          <td>${usuario.edad}</td>
          <td>${usuario.fechaAlta.toLocaleString()}</td>
        `;
        userList.appendChild(row);
      }
    }
  
    function consultarUsuario(nickname) {
      const usuario = usuariosRegistrados[nickname];
      if (usuario) {
        alert(`Nombre: ${usuario.nombre}\nDNI: ${usuario.dni}\nEdad: ${usuario.edad}\nFecha de Alta: ${usuario.fechaAlta}`);
      } else {
        alert('Usuario no encontrado.');
      }
    }
  
    function consultarUltimoLogin() {
      let ultimoUsuario = null;
      let ultimaFecha = null;
  
      for (const nickname in usuariosRegistrados) {
        const usuario = usuariosRegistrados[nickname];
        if (!ultimaFecha || usuario.fechaAlta > ultimaFecha) {
          ultimoUsuario = usuario;
          ultimaFecha = usuario.fechaAlta;
        }
      }
  
      if (ultimoUsuario) {
        alert(`Nombre: ${ultimoUsuario.nombre}\nDNI: ${ultimoUsuario.dni}\nEdad: ${ultimoUsuario.edad}\nFecha de Alta: ${ultimoUsuario.fechaAlta}`);
      } else {
        alert('No hay usuarios registrados.');
      }
    }
  
    registrarUsuarioButton.addEventListener('click', function () {
      const nickname = document.getElementById('nickname').value;
      const nombre = document.getElementById('nombre').value;
      const password = document.getElementById('password').value;
      const dni = document.getElementById('dni').value;
      const edad = document.getElementById('edad').value;
  
      if (!nickname || !nombre || !password || !dni || !edad) {
        alert('Por favor, complete todos los campos.');
        return;
      }
  
      guardarUsuario(nickname, nombre, password, dni, edad);
      mostrarUsuariosRegistrados();
  
      document.getElementById('nickname').value = '';
      document.getElementById('nombre').value = '';
      document.getElementById('password').value = '';
      document.getElementById('dni').value = '';
      document.getElementById('edad').value = '';
    });
  
    borrarDatosButton.addEventListener('click', function () {
      if (confirm('¿Estás seguro de que quieres borrar todos los datos almacenados?')) {
        usuariosRegistrados = {};
        userList.innerHTML = '';
      }
    });
  
    consultarUsuarioButton.addEventListener('click', function () {
      const nickname = document.getElementById('nickname').value;
      if (nickname) {
        consultarUsuario(nickname);
      } else {
        alert('Por favor, ingrese un nickname para consultar.');
      }
    });
  
    consultarUltimoLoginButton.addEventListener('click', function () {
      consultarUltimoLogin();
    });
  });
  