/*
 * package ar.com.ada.backend12.rentavehiculosjpa.controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestParam; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import ar.com.ada.backend12.rentavehiculosjpa.model.Contrato; import
 * ar.com.ada.backend12.rentavehiculosjpa.service.ContratoService; import
 * ar.com.ada.backend12.rentavehiculosjpa.util.ApiReturnable;
 * 
 * @RestController public class ContratoController {
 * 
 * @Autowired ContratoService contratoService;
 * 
 * // CREAR UN CONTRATO
 * 
 * @PostMapping("/contrato") private ResponseEntity<ApiReturnable>
 * insert(@RequestParam String placa, @RequestParam Integer cliente_id,
 * 
 * @RequestParam String fecha_de_inicio, @RequestParam Integer
 * dias, @RequestParam Integer valor_cancelado) {
 * 
 * Contrato c = new Contrato();
 * 
 * c.setPlaca(placa); c.setCliente_id(cliente_id);
 * c.setFecha_de_inicio(fecha_de_inicio); c.setDias_en_mora(dias);
 * c.setValor_cancelado(valor_cancelado);
 * 
 * contratoService.insert(c); return new ResponseEntity<ApiReturnable>(c,
 * HttpStatus.CREATED);
 * 
 * }
 * 
 * }
 */