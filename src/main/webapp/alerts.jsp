        <script>
        document.addEventListener('DOMContentLoaded', function() {
            // Obtenha o elemento do alerta
            const alerta = document.querySelector('.alert');

            // Defina o tempo de fechamento autom�tico em milissegundos (por exemplo, 3000 ms para 3 segundos)
            const tempoFecharAutomatico = 5000;

            // Feche o alerta automaticamente ap�s o tempo definido
            setTimeout(function() {
                alerta.classList.remove('show');
                alerta.classList.add('hide');
            }, tempoFecharAutomatico);
        });
    </script>