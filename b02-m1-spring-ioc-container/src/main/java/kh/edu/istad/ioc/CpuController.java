package kh.edu.istad.ioc;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequiredArgsConstructor
public class CpuController {

    private final CPU cpu;
    private final CPU cpu2;

    public CpuController(CPU cpu,
                         @Qualifier("amd64Cpu") CPU cpu2) {
        this.cpu = cpu;
        this.cpu2 = cpu2;
    }

    @GetMapping("/api/cpu")
    public List<CPU> getCpuList() {
        return List.of(cpu, cpu2);
    }

}
