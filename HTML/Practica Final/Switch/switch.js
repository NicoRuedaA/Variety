// Función reutilizable para crear lógica de joysticks
function crearJoystick(selector, controles) {
  const elemento = document.querySelector(selector);
  const distancia = 7;

  // Estado interno de ESTE joystick
  let x = 0;
  let y = 0;
  const teclasActivas = {
    up: false,
    down: false,
    left: false,
    right: false,
  };

  function actualizar() {
    x = 0;
    y = 0;
    if (teclasActivas.up) y -= distancia;
    if (teclasActivas.down) y += distancia;
    if (teclasActivas.left) x -= distancia;
    if (teclasActivas.right) x += distancia;

    elemento.style.transform = `translate3d(${x}px, ${y}px, 0)`;
  }

  // Event Listeners globales
  document.addEventListener("keydown", (e) => {
    const key = e.key.toLowerCase();

    // Verificamos si la tecla pulsada corresponde a este joystick
    if (key === controles.up) teclasActivas.up = true;
    if (key === controles.down) teclasActivas.down = true;
    if (key === controles.left) teclasActivas.left = true;
    if (key === controles.right) teclasActivas.right = true;

    actualizar();
  });

  document.addEventListener("keyup", (e) => {
    const key = e.key.toLowerCase();

    if (key === controles.up) teclasActivas.up = false;
    if (key === controles.down) teclasActivas.down = false;
    if (key === controles.left) teclasActivas.left = false;
    if (key === controles.right) teclasActivas.right = false;

    actualizar();
  });
}

// --- CONFIGURACIÓN ---

// 1. Inicializar Joystick Izquierdo (WASD)
crearJoystick(".joystick-left", {
  up: "w",
  down: "s",
  left: "a",
  right: "d",
});

// 2. Inicializar Joystick Derecho (FLECHAS)
// Nota: Las teclas de flechas se llaman 'arrowup', 'arrowdown', etc.
crearJoystick(".joystick-right", {
  up: "arrowup",
  down: "arrowdown",
  left: "arrowleft",
  right: "arrowright",
});
