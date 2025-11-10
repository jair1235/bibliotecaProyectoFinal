const apiUrl = "http://localhost:8082/libros";

async function cargarLibros() {
  const res = await fetch(apiUrl);
  const libros = await res.json();
  mostrarLibros(libros);
}

function mostrarLibros(libros) {
  const tbody = document.getElementById("tablaLibros");
  tbody.innerHTML = "";
  libros.forEach((l) => {
    tbody.innerHTML += `
      <tr>
        <td>${l.id}</td>
        <td>${l.titulo}</td>
        <td>${l.autor}</td>
        <td>${l.editorial}</td>
      </tr>`;
  });
}

async function agregarLibro() {
  const libro = {
    titulo: document.getElementById("titulo").value,
    autor: document.getElementById("autor").value,
    editorial: document.getElementById("editorial").value,
    fechaPublicacion: document.getElementById("fecha").value,
  };

  const res = await fetch(apiUrl, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(libro),
  });

  if (res.ok) {
    alert("Libro agregado correctamente.");
    cargarLibros();
  } else {
    alert("Error al agregar libro.");
  }
}

async function buscarPorId() {
  const id = document.getElementById("buscarId").value;
  if (!id) return alert("Ingrese un ID");
  const res = await fetch(`${apiUrl}/${id}`);
  if (res.ok) {
    const libro = await res.json();
    mostrarLibros([libro]);
  } else {
    alert("Libro no encontrado");
  }
}

async function buscarPorAutor() {
  const autor = document.getElementById("buscarAutor").value;
  if (!autor) return alert("Ingrese el nombre del autor");
  const res = await fetch(`${apiUrl}/autor/${autor}`);
  const libros = await res.json();
  mostrarLibros(libros);
}

cargarLibros();
