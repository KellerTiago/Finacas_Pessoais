        <script>
        document.addEventListener('DOMContentLoaded', function() {
            // Obtenha o elemento do alerta
            const alerta = document.querySelector('.alert');

            // Defina o tempo de fechamento automático em milissegundos (por exemplo, 3000 ms para 3 segundos)
            const tempoFecharAutomatico = 5000;

            // Feche o alerta automaticamente após o tempo definido
            setTimeout(function() {
                alerta.classList.remove('show');
                alerta.classList.add('hide');
            }, tempoFecharAutomatico);
        });
    </script>